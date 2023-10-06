public class Juridica extends pessoa{
    private String logotipo;
    private String empresa;
    private Long cnpj;

    public String getlogotipo(){
        return logotipo;
    }

    public String getEmpresa(){
        return empresa;
    }

    public Long getCnpj(){
        return cnpj;
    }

    public void setLogotipo(String logotipo){
        this.logotipo = logotipo;
    }

    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }

    public void setCnpj(Long cnpj){
        this.cnpj = cnpj;
    }
}
