package co.com.santander.serviciosexternos.objetoscomunes.utils;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

public class WebServicesUtils {

    public static Object ConsumirEndPointRest(String metodoHttp, String urlEndpoint, Object requestBody, Map<String,String> requestHeader){
        Object response = null;
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(urlEndpoint);
            if(requestHeader != null && requestHeader.size()>0){
                requestHeader.forEach((c,v)->builder.queryParam(c,v));
            }
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<Object> dataRequest = new HttpEntity<>(requestBody, headers);
            response = restTemplate.exchange(builder.toUriString(), HttpMethod.valueOf(metodoHttp.toUpperCase()), dataRequest, Object.class, headers).getBody();
        } catch (Exception e) {
            System.out.println("Error desconocido consumiendo el servicio Rest"+e.getMessage());
        }
        return response;
    }
}
