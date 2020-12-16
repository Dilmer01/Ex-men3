package pe.Mendieta;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.google.gson.Gson;

import pe.Mendieta.dao.RolDao;
import pe.Mendieta.dao.UsuarioDao;
import pe.Mendieta.entity.Rol;

@SpringBootTest
class MendietaApplicationTests {

@Autowired
PasswordEncoder passwordEncoder;
@Test
void contextLoads() {
	System.out.println(passwordEncoder.encode("123"));
}
		
}
