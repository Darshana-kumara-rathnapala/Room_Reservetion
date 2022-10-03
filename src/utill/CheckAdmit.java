package utill;

public class CheckAdmit {
    final String Aname="Admin";
    final String Apassword="q123";
    final String Uname="User";
    final String Upassword="w123";
    private  String name;
    private  String password;
    private String form=null;

    public CheckAdmit(String name, String password){
        this.name=name;
        this.password=password;
    }
    public boolean check(){
        boolean b=false;
        if (name.equals("Admin")){
            if (Aname.equals(name)&&Apassword.equals(password)) {
                b = true;
                form="AdminForm";
            }
          }else if(name.equalsIgnoreCase("User")){
            if(Uname.equals(name)&&Upassword.equals(password)){
                b=true;
                form="UserForm";
            }
        }
        return b;
    }
    public String get(){
        return form;
    }

}
