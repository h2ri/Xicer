package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@Autowired
	CelfyService celfyService;
    private static final String template = "Hello, %s!";
   

	@RequestMapping("/greeting")
    public ResponseEntity<Celfy> greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	Celfy c = celfyService.getCelfy();
    	
    	if( c == null)
    	{
    		return null;
    	}
    	return new ResponseEntity<Celfy>(c,HttpStatus.CREATED);
    }
	
}
