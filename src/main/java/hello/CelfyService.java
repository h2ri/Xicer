package hello;


import org.springframework.beans.factory.annotation.Autowired;

public class CelfyService {
	@Autowired
	public CelfyRepository celfyRepository;	
	public CelfyService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Celfy getCelfy() {
		Celfy celfy = new Celfy();
    	celfy.setName("Xicer");
    	celfy =celfyRepository.save(celfy);
    	celfyRepository.findOne(celfy.getId());
    	Celfy c = celfyRepository.findByName("Xicer");
		return c;
	}
}