/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.enphasis.example.bean;

import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author LOG
 */
@ManagedBean
@SessionScoped
public class EncuestaBean {
public EncuestaBean() {
    }
   private String response1;

    public String getResponse1() {
        return response1;
    }

    public void setResponse1(String response1) {
        this.response1 = response1;
    }
   private int[] response3;
   private String response2,response4;
   private String[] sistemaoperativo;
   private String portatil;
   private int califacion;
   private int mysqlresponse,postgresresponse;
   private String oracleresponse;

    public String getOracleresponse() {
        return oracleresponse;
    }

    public void setOracleresponse(String oracleresponse) {
        this.oracleresponse = oracleresponse;
    }

    public int getPostgresresponse() {
        return postgresresponse;
    }

    public void setPostgresresponse(int postgresresponse) {
        this.postgresresponse = postgresresponse;
    }
   

    public int getMysqlresponse() {
        return mysqlresponse;
    }

    public void setMysqlresponse(int mysqlresponse) {
        this.mysqlresponse = mysqlresponse;
    }

    public int getCalifacion() {
        return califacion;
    }

    public void setCalifacion(int califacion) {
        this.califacion = califacion;
    }

    public String getPortatil() {
        return portatil;
    }

    public void setPortatil(String portatil) {
        this.portatil = portatil;
    }
   

    public String[] getSistemaoperativo() {
        return sistemaoperativo;
    }

    public void setSistemaoperativo(String[] sistemaoperativo) {
        this.sistemaoperativo = sistemaoperativo;
    }

   

   
   
   public String getSistemaOperativoInString(){
   return Arrays.toString(sistemaoperativo);

   }
   
    public int[] getResponse3() {
        return response3;
    }

    public void setResponse3(int[] response3) {
        this.response3 = response3;
    }

    public String getResponse4() {
        return response4;
    }

    public void setResponse4(String response4) {
        this.response4 = response4;
    }
   

   

    public String getResponse2() {
        return response2;
    }

    public void setResponse2(String response2) {
        this.response2 = response2;
    }
  
   public String registrarDatos(){
     return "result";
   }
   
    
    
}
