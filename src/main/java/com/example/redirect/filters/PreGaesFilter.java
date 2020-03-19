package com.example.redirect.filters;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreGaesFilter  extends ZuulFilter{
	
	Logger log = LoggerFactory.getLogger(PreGaesFilter.class); 
	
	@Override
	public Object run() {		
		 RequestContext ctx = RequestContext.getCurrentContext();	    
	     StringBuffer strLog=new StringBuffer();
	     strLog.append("\n------ FILTRANDO Gaes - GaesFilter FILTER  ------\n");	    
	     addRequestHeader(ctx);
	    
	     log.info(strLog.toString());
	     return null;
	}
	
	
	void addRequestHeader(RequestContext ctx)
	{
		ctx.addZuulRequestHeader("Access-Control-Allow-Credentials", "true");
		ctx.addZuulRequestHeader("Access-Control-Allow-Headers", "Content-Type");
		ctx.addZuulRequestHeader("Access-Control-Allow-Methods", "GET, POST");
		ctx.addZuulRequestHeader("Access-Control-Allow-Origin", "https://www.example.com");
	}
	/**
	 * Quito de las HEADERS los parametros pasados en la lista.
	 * @param ctx
	 * @param listRemove
	 */
	void removeRequestHeader(RequestContext ctx, List<String> listRemove)
	{
		Map<String,String> headers=ctx.getZuulRequestHeaders();
		if (headers==null)
			return;
		List<String> headerPut= new ArrayList<>();
		headers.forEach( (key,value) -> {
			if (!listRemove.contains(key))
			{
				headerPut.add(key);
			}
		});
		// Esto solo funcionara si el orden del filtro es inferior a PRE_DECORATION_FILTER_ORDER
		ctx.put("zuulResponseHeaders", headerPut);
	}
	@Override
	public boolean shouldFilter() {				
		return true;
	}

	@Override
	public int filterOrder() {
		
		return FilterConstants.SEND_RESPONSE_FILTER_ORDER; 
	}

	@Override
	public String filterType() {
		return FilterConstants.PRE_TYPE;
	}
	
	
	
	
}
