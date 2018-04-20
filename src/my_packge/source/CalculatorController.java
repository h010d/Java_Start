package my_packge.source;

public class FXMLCalculatorController implements Initializable {
    @FXML
    private TextArea t;
    @FXML
    private TextField e;
    float[]m;
    float result;
    int i=-1;
    int[]oper;
    @FXML
    private void resultButton(ActionEvent event) {
        resultate();
    }
    @FXML
    private void plus(ActionEvent event){
        fb(1,"+");
    }
    @FXML
    private void minus(ActionEvent event){
        fb(2, "-");
    }
    @FXML
    private void gPlus(ActionEvent event){
        fb(3, "*");
    }
    @FXML
    private void gMinus(ActionEvent event){
        fb(4, "/");
    }
    @FXML
    private void clean(ActionEvent event){
        clean();
    }
    @FXML
    private void keyAction(KeyEvent event){
        switch(event.getText()){
            case "+":
                fb(1, "+");
                break;
            case "-":
                fb(2, "-");
                break;
            case "*":
                fb(3, "*");
                break;
            case "/":
                fb(4, "/");
                break;
            case "=":
                resultate();
                break;
            case "c":
                clean();
                break;
            case "с":
                21
                clean();
                break;
            default:
                break;
        }
        if(event.getCode().getName().equals("Enter")){
            resultate();
        }
        if(event.getCode().getName().equals("Delete")){
            clean();
        }
    }
    @FXML
    private void keyPostAction(KeyEvent event){
        if(event.getText().equals("*")||event.getText().equals("/")||
                event.getText().equals("c")||event.getText().equals("с")) {
            e.setText("");
        }
        if(e.getText().contains("=")){
            e.setText(e.getText().substring(1));
        }
    }
    void resultate(){
        i++;
        if(i>19){
            alertWindow("Угроза переполнения!","Внимание!");
            return;
        }
        try{
            m[i]=Float.parseFloat(e.getText());
        }catch(NumberFormatException ex){
            ex.getMessage();
            i–;
            e.setText("");
            e.requestFocus();
            return;
        }
        t.appendText(m[i]+"=");
        switch (oper[0]){
            case 1:result=m[0]+m[1];break;
            case 2:result=m[0]-m[1];break;
            case 3:result=m[0]*m[1];break;
            case 4:result=m[0]/m[1];break;
        }
        for (int j=1;j<i+1;j++){
            switch (oper[j]){
                case 1:result+=m[j+1];break;
                case 2:result-=m[j+1];break;
                case 3:result*=m[j+1];break;
                case 4:result/=m[j+1];break;
            }
        }
        e.setText(result+"");
    }
    void fb(int n,String s){
        i++;
        if(i>18){
            22
            i–;
            alertWindow("Угроза переполнения!","Внимание!");
            return;
        }
        try{
            m[i]=Float.parseFloat(e.getText());
        }catch(NumberFormatException ex){
            ex.getMessage();
            i–;
            e.setText("");
            e.requestFocus();
            return;
        }
        e.setText("");
        e.requestFocus();
        oper[i]=n;
        t.appendText(m[i]+""+s);
    }
    void clean(){
        i=-1;
        result=0;
        m=new float[20];
        oper=new int[20];
        t.setText("");
        e.setText("");
        e.requestFocus();
    }
    void alertWindow(String s,String str){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(str);
        alert.setHeaderText(null);
        alert.setContentText(s);
        alert.showAndWait();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        m=new float[20];
        oper=new int[20];
        e.requestFocus();
    }
}