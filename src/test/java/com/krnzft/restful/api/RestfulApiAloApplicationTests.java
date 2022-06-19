package com.krnzft.restful.api;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.krnzft.restful.api.dto.PriceRequest;

@SpringBootTest
@AutoConfigureMockMvc
class RestfulApiAloApplicationTests {

	private static final String URL_ENDPOINT = "/api/price/currentPrice";
	@Autowired
	private MockMvc mvc;
	@Autowired
    private ObjectMapper mapper;
	
	@Test
	public void testIsPrice35_50WhenHourIs10AnDay14() throws Exception {
		// El precio del producto es 35.50
		PriceRequest request = new PriceRequest("2020-06-14-10.00.00", 35455L, 1L);
		
		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post(URL_ENDPOINT)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsString(request));
		
		mvc.perform(mockRequest
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", Matchers.hasSize(1)))
				.andExpect(jsonPath("$[0]", notNullValue()))
				.andExpect(jsonPath("$[0].price", is(35.50)));
	}
	
	@Test
	public void testIsPrice25_45WhenHourIs16andDay14() throws Exception {
		// El precio del producto es 25.45
		PriceRequest request = new PriceRequest("2020-06-14-16.00.00", 35455L, 1L);
		
		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post(URL_ENDPOINT)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsString(request));
		
		mvc.perform(mockRequest
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", Matchers.hasSize(1)))
				.andExpect(jsonPath("$[0]", notNullValue()))
				.andExpect(jsonPath("$[0].price", is(25.45)));
	}
	
	@Test
	public void testIsPrice35_50WhenHourIs21AndDay14() throws Exception {
		// El precio del producto es 35.50
		PriceRequest request = new PriceRequest("2020-06-14-21.00.00", 35455L, 1L);
		
		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post(URL_ENDPOINT)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsString(request));
		
		mvc.perform(mockRequest
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", Matchers.hasSize(1)))
				.andExpect(jsonPath("$[0]", notNullValue()))
				.andExpect(jsonPath("$[0].price", is(35.50)));
	}
	
	@Test
	public void testIsPrice30_50WhenHourIs10AndDay15() throws Exception {
		// El precio del producto es 30.50
		PriceRequest request = new PriceRequest("2020-06-15-10.00.00", 35455L, 1L);
		
		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post(URL_ENDPOINT)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsString(request));
		
		mvc.perform(mockRequest
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", Matchers.hasSize(1)))
				.andExpect(jsonPath("$[0]", notNullValue()))
				.andExpect(jsonPath("$[0].price", is(30.50)));
	}
	
	@Test
	public void testIsPrice38_95WhenHourIs21AndDay16() throws Exception {
		// El precio del producto es 38.95
		PriceRequest request = new PriceRequest("2020-06-16-21.00.00", 35455L, 1L);
		
		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post(URL_ENDPOINT)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsString(request));
		
		mvc.perform(mockRequest
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", Matchers.hasSize(1)))
				.andExpect(jsonPath("$[0]", notNullValue()))
				.andExpect(jsonPath("$[0].price", is(38.95)));
	}

}
