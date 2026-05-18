class Login{

    private String username=
            "admin";

    private String password=
            "1234";

    public boolean authenticate(
            String user,
            String pass){

        return user.equals(
                username)

                &&

                pass.equals(
                password);

    }

}