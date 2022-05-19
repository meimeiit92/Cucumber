package B1_Cucumber_MayTinh;

public class MayTinh {
    public long tong(long a, long b){
        return  a+b;
    }
    public long thuong (long a, long b){
        if(b==0){
            throw  new RuntimeException("Mau so phai khac 0");
        }
        return a/b;
    }
}
