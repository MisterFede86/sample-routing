package cb.countries.samplerouting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

@RunWith(SpringRunner.class)public class JunitSampleRoutingTest {

	private TestRestTemplate template = new TestRestTemplate();

	@Test
	public void sampleRouting() throws Exception {
		
		String responseBody = "[{\"name\":\"Afghanistan\",\"topLevelDomain\":[\".af\"],\"alpha2Code\":\"AF\",\"alpha3Code\":\"AFG\",\"callingCodes\":[\"93\"],\"capital\":\"Kabul\",\"altSpellings\":[\"AF\",\"Afġānistān\"],\"region\":\"Asia\",\"subregion\":\"Southern Asia\",\"population\":27657145,\"latlng\":[33.0,65.0],\"demonym\":\"Afghan\",\"area\":652230.0,\"gini\":27.8,\"timezones\":[\"UTC+04:30\"],\"borders\":[\"IRN\",\"PAK\",\"TKM\",\"UZB\",\"TJK\",\"CHN\"],\"nativeName\":\"افغانستان\",\"numericCode\":\"004\",\"currencies\":[{\"code\":\"AFN\",\"name\":\"Afghan afghani\",\"symbol\":\"؋\"}],\"languages\":[{\"iso639_1\":\"ps\",\"iso639_2\":\"pus\",\"name\":\"Pashto\",\"nativeName\":\"پښتو\"},{\"iso639_1\":\"uz\",\"iso639_2\":\"uzb\",\"name\":\"Uzbek\",\"nativeName\":\"Oʻzbek\"},{\"iso639_1\":\"tk\",\"iso639_2\":\"tuk\",\"name\":\"Turkmen\",\"nativeName\":\"Türkmen\"}],\"translations\":{\"de\":\"Afghanistan\",\"es\":\"Afganistán\",\"fr\":\"Afghanistan\",\"ja\":\"アフガニスタン\",\"it\":\"Afghanistan\",\"br\":\"Afeganistão\",\"pt\":\"Afeganistão\",\"nl\":\"Afghanistan\",\"hr\":\"Afganistan\",\"fa\":\"افغانستان\"},\"flag\":\"https://restcountries.eu/data/afg.svg\",\"regionalBlocs\":[{\"acronym\":\"SAARC\",\"name\":\"South Asian Association for Regional Cooperation\",\"otherAcronyms\":[],\"otherNames\":[]}],\"cioc\":\"AFG\"}"; 
		HttpHeaders headers = template.getForEntity("http://restcountries.eu/rest/v2/all", String.class).getHeaders();
		assertNotSame(headers.getContentType(), MediaType.APPLICATION_JSON);
		ResponseEntity<String> resp = template.getForEntity("http://restcountries.eu/rest/v2/all", String.class);
		assertEquals(resp.getBody(), responseBody);
	}}

