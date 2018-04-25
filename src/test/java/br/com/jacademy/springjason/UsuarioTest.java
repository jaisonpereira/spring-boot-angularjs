package br.com.jacademy.springjason;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.jacademy.springjason.model.Usuario;
import br.com.jacademy.springjason.service.UsuarioService;
import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioTest extends TestCase {
	private Usuario user;
	@Autowired
	private UsuarioService service;

	@Before
	public void setUp() {
		user = new Usuario();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testUserValid() {
		service.valid(user);
	}

	@Test
	public void testUserNull() throws Exception {
		user = service.find(1);
		assertEquals(user.getNome(), "Jason");
	}

	@Test
	public void testSaveUser() {
		try {
			user.setNome("Jason");
			service.save(user);
		} catch (Exception e) {
			fail("Falha ao testar save do arquivo");
		}
	}

}
