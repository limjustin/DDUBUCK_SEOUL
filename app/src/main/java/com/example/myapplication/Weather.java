package com.example.myapplication;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Weather extends AppCompatActivity {

    TextView textview;
    Document doc = null;
    LinearLayout layout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        textview = (TextView) findViewById(R.id.textView1);

    }

    public void onClick(View view){
        GetXMLTask task = new GetXMLTask();
        task.execute("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1117063000");

    }

    private class GetXMLTask extends AsyncTask<String, Void, Document> {

        @Override
        protected Document doInBackground(String... urls) {
            URL url;
            try {
                url = new URL(urls[0]);
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder(); //XML문서 빌더 객체를 생성
                doc = db.parse(new InputSource(url.openStream())); //XML문서를 파싱한다.
                doc.getDocumentElement().normalize();

            } catch (Exception e) {
                Toast.makeText(getBaseContext(), "Parsing Error", Toast.LENGTH_SHORT).show();
            }
            return doc;
        }

        @Override
        protected void onPostExecute(Document doc) {

            String s = "";
            //data태그가 있는 노드를 찾아서 리스트 형태로 만들어서 반환
            NodeList nodeList = doc.getElementsByTagName("data");
            //data 태그를 가지는 노드를 찾음, 계층적인 노드 구조를 반환

            for(int i = 0; i< 9; i++){  // 앞으로 24시간까지 날씨를 표시

                //날씨 데이터를 추출
                s += ""+ " ";

                Node node = nodeList.item(i); //data엘리먼트 노드
                Element fstElmnt = (Element) node;




                /*NodeList dayList = fstElmnt.getElementsByTagName("day");
                s += dayList.item(0).getChildNodes().item(0).getNodeValue()+"일"+"  ";*/

                NodeList timeList = fstElmnt.getElementsByTagName("hour");
                s += timeList.item(0).getChildNodes().item(0).getNodeValue()+"시"+"  ";

                NodeList tempList = fstElmnt.getElementsByTagName("temp");
                s += tempList.item(0).getChildNodes().item(0).getNodeValue() +"°C"+"  ";

                NodeList websiteList = fstElmnt.getElementsByTagName("wfKor");
                s += websiteList.item(0).getChildNodes().item(0).getNodeValue() +"\n";

            }

            textview.setText(s);
            super.onPostExecute(doc);
        }

    }
}
