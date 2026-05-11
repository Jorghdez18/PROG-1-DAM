package com.proyecto.repository;

import com.proyecto.model.Usuario;

public interface IUsuarioRepository {

    /**
     * Crea un usuario nuevo
     * @param usuario usuario nuevo
     * @return true/false depdende de resultado
     */
    boolean create(Usuario usuario);

    
}
