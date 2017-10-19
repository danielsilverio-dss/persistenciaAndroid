package com.example.logonrm.persistencia;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by logonrm on 19/10/2017.
 */

@DatabaseTable(tableName = "TB_LIVRO")
public class LivroBean {

    @DatabaseField(columnName = "ID", generatedId = true)
    private int id;

    @DatabaseField(columnName = "NM_AUTOR")
    private String autor;

    @DatabaseField(columnName = "DS_TITULO")
    private String titulo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
