

public class Hitung {
 int pembilang1;
 int pembilang2;
 int penyebut1;
 int penyebut2;
 int kpk = 0;
 int x;
 
public void setKpk(int py1, int py2){
 
this.penyebut1 = py1;
 this.penyebut2 = py2;
 
if(py1 == py2){
 kpk = py1;
 }else if(py1>py2){
 if(py1 % py2==0){
 kpk = py1;
 }else{kpk = py1*py2;}
 }else if(py1<py2){
 if(py2%py1==0){
 kpk = py2;
 }else{kpk = py2*py1;}
 }
 }
 public int getKpk(){
 return kpk;
 }
  
}
