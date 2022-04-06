package springbootjooleproject.Repository;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import springbootjooleproject.Entity.TechnichalDetail;

@SpringBootTest
class TechnichalDetailRepsitoryTest {
	@Autowired
	private TechnichalDetailRepository repsitory;
	@Test
	void test() {
		TechnichalDetail tec = new TechnichalDetail("Flying on sky");
		
		repsitory.save(tec);
		
		Assertions.assertThat(tec.getId()).isGreaterThan(0);
	}

}
