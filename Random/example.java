class example {
    private String password;

    public void encapculation(){
    }
    public String getPwd(){
        return this.password;
    }
    public void setPWd(String str){
        this.password = str;
    }

    public static void main(String[] args) {
        example obj = new example();
        obj.setPWd("12335");

        System.out.println(obj.getPwd());

    }
    
}