package com.example.DemoForJenkins;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.model.EmployeeDTO;

@SpringBootTest
public class EmployeeDTOTest {

   private EmployeeDTO underTest;
	

   @Test
   public void testThis() {
	    underTest = new EmployeeDTO(12345, "Rak", "Dev", "Bangalore");
		underTest.setId(12345);
		underTest.setEmpName("Rak");
		underTest.setDepartment("Dev");
		underTest.setAddress("Bangalore");
		
        assertThat(underTest.getId()).isEqualTo(12345);
        assertThat(underTest.getEmpName()).isEqualTo("Rak");
        assertThat(underTest.getDepartment()).isEqualTo("Dev");
        assertThat(underTest.getAddress()).isEqualTo("Bangalore");

    }
	
	
}
