package it.aimconsulting.utility.utli;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class PostRequest {
	
	public String postRequest(String url,List<NameValuePair> urlParameters) {
		CloseableHttpResponse response2 = null;
		 try {
		        //Define a postRequest request
			    //HttpClient client = HttpClientBuilder.create().build();
			    CloseableHttpClient httpclient = HttpClients.createDefault();
		        HttpPost httpPost = new HttpPost(url);
		        //httpPost.addHeader("content-type", "text/xml");
		        httpPost.setEntity(new UrlEncodedFormEntity(urlParameters,Consts.UTF_8));


		        response2 = httpclient.execute(httpPost);

		       
		            System.out.println(response2.getStatusLine());
		            HttpEntity entity2 = response2.getEntity();
		            return EntityUtils.toString(entity2);
		            //EntityUtils.consume(entity2);
		        } catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		        }
				finally {
		            try {
						response2.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		return null;
	}
	
	public String getRequest(String url,List<NameValuePair> urlParameters) {
		CloseableHttpResponse response2 = null;
		 try {
		        //Define a postRequest request
			    //HttpClient client = HttpClientBuilder.create().build();
			    CloseableHttpClient httpclient = HttpClients.createDefault();
		        
		        
		        Iterator<NameValuePair> iterParam = urlParameters.iterator();
		        boolean first = true;
		        String request = "";
		        while (iterParam.hasNext()) {
					NameValuePair nameValuePair = (NameValuePair) iterParam.next();
					if(first) {
						request = request+nameValuePair.getName()+"="+nameValuePair.getValue();
					}else {
						request =  request+"&"+nameValuePair.getName()+"="+nameValuePair.getValue();
					}
				}
		        url = url+"?"+URLEncoder.encode(request, "UTF-8");
		        
		        HttpGet httpGet = new HttpGet(url);
		        httpGet.addHeader("content-type", "text/xml");
		        response2 = httpclient.execute(httpGet);

		       
		            System.out.println(response2.getStatusLine());
		            HttpEntity entity2 = response2.getEntity();
		            return EntityUtils.toString(entity2);
		            //EntityUtils.consume(entity2);
		        } catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		        }
				finally {
		            try {
						response2.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		return null;
	}

}
