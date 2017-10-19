package com.example.logonrm.persistencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BibliotecaDB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = OpenHelperManager.getHelper(this, BibliotecaDB.class);



    }

    public void create(View v){

        List<LivroBean> livros = criaLivros();

        try {
            Dao<LivroBean, Integer> dao = db.getDao(LivroBean.class);

            for (LivroBean livro: livros) {
                dao.create(livro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listar(View v){

        try {

            Dao<LivroBean, Integer> dao = db.getDao(LivroBean.class);
            List<LivroBean> livros = dao.queryForAll();

            for (LivroBean livro: livros) {
                Toast.makeText(this, "nome: " + livro.getTitulo(), Toast.LENGTH_SHORT).show();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

















    public List<LivroBean> criaLivros(){

        List<LivroBean> livros = new ArrayList<LivroBean>();

        for (int i = 0; i < 3; i++){
            LivroBean l = new LivroBean();
            l.setTitulo("nome"+i);
            l.setAutor("autor"+i);
            livros.add(l);
        }
        return livros;
    }


}
