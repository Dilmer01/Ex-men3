package pe.Mendieta.dao;

import java.util.Map;

import pe.Mendieta.entity.Usuario;

public interface UsuarioDao {
Usuario validarUsuario(String nomuser);
Map<String, Object> datosUsuario(String username);
}
