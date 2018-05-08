package model;

public class Usuario {
    
    private int id; 
    private String nickname;
    private String pass;
    private String perfil;

    
    public Usuario() {
    }

    public Usuario(int id, String nickname, String pass) {
        this.id = id;
        this.nickname = nickname;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nickname=" + nickname + ", pass=" + pass + '}';
    }
    
}
