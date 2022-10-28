package assignment_8;

public class Book {
    private String MaSach;
    private  String Ten;
    private  String TacGia;
    private  String NhaXuatBan;
    private  String LoaiSach;
    private  String Gia;
    private  Integer SoLuong;

    public Book(String maSach, String ten, String tacGia, String nhaXuatBan, String loaiSach, String gia, Integer soLuong) {
        MaSach = maSach;
        Ten = ten;
        TacGia = tacGia;
        NhaXuatBan = nhaXuatBan;
        LoaiSach = loaiSach;
        Gia = gia;
        SoLuong = soLuong;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String maSach) {
        MaSach = maSach;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        NhaXuatBan = nhaXuatBan;
    }

    public String getLoaiSach() {
        return LoaiSach;
    }

    public void setLoaiSach(String loaiSach) {
        LoaiSach = loaiSach;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer soLuong) {
        SoLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Book{" +
                "MaSach='" + MaSach + '\'' +
                ", Ten='" + Ten + '\'' +
                ", TacGia='" + TacGia + '\'' +
                ", NhaXuatBan='" + NhaXuatBan + '\'' +
                ", LoaiSach='" + LoaiSach + '\'' +
                ", Gia='" + Gia + '\'' +
                ", SoLuong=" + SoLuong +
                '}';
    }
}
