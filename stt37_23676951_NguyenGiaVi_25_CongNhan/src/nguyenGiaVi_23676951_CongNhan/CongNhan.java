package nguyenGiaVi_23676951_CongNhan;

public class CongNhan {
    private String maCN;
    private String mHo;
    private String mTen;
    private int mSoSP;

    public CongNhan(String maCN, String mHo, String mTen, int mSoSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP;
    }

    public double tinhLuong() {
        double donGia;
        if (mSoSP >= 600) {
            donGia = 0.65;
        } else if (mSoSP >= 400) {
            donGia = 0.6;
        } else if (mSoSP >= 200) {
            donGia = 0.55;
        } else {
            donGia = 0.5;
        }
        return mSoSP * donGia;
    }

    public String getMaCN() {
        return maCN;
    }

    public String getHo() {
        return mHo;
    }

    public String getTen() {
        return mTen;
    }

    public int getSoSP() {
        return mSoSP;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-15s %-10d %-10.2f", maCN, mHo, mTen, mSoSP, tinhLuong());
    }
}


