package nguyenGiaVi_23676951_CongNhan;

public class DanhSachCongNhan {
    private CongNhan[] danhSach;
    private int soLuong;

    public DanhSachCongNhan(int n) {
        danhSach = new CongNhan[n];
        soLuong = 0;
    }

    public boolean themCongNhan(CongNhan cn) {
        if (soLuong < danhSach.length) {
        danhSach[soLuong++] = cn;
        return true;
        }
        return false;
    }

    public boolean xoaCongNhan(String maCN) {
        for (int i = 0; i < soLuong; i++) {
        if (danhSach[i].getMaCN().equals(maCN)) {
        for (int j = i; j < soLuong - 1; j++) {
            danhSach[j] = danhSach[j + 1];
        }
            danhSach[soLuong - 1] = null;
            soLuong--;
        return true;
        }
        }
        return false;
    }

    public int laySoLuongCongNhan() {
        return soLuong;
    }

    public CongNhan[] layDanhSachTren200SP() {
        int count = 0;
        for (int i = 0; i < soLuong; i++) {
        if (danhSach[i].getSoSP() > 200) {
            count++;
        }
        }

        CongNhan[] result = new CongNhan[count];
        int index = 0;
        for (int i = 0; i < soLuong; i++) {
        if (danhSach[i].getSoSP() > 200) {
            result[index++] = danhSach[i];
        }
        }

        return result;
    }


    public void sapXepTheoSoSP() {
        for (int i = 0; i < soLuong - 1; i++) {
        for (int j = 0; j < soLuong - i - 1; j++) {
        if (danhSach[j].getSoSP() < danhSach[j + 1].getSoSP()) {
            CongNhan temp = danhSach[j];
            danhSach[j] = danhSach[j + 1];
            danhSach[j + 1] = temp;
        }
        }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s %-15s %-15s %-10s %-10s%n", "Mã CN", "Họ", "Tên", "Số SP", "Lương"));
        for (int i = 0; i < soLuong; i++) {
        sb.append(danhSach[i]).append("\n");
        }
        return sb.toString();
    }
}
