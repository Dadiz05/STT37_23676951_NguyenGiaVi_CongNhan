package nguyenGiaVi_23676951_CongNhan;

import java.util.Scanner;

public class TestCongNhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachCongNhan ds = new DanhSachCongNhan(5);

        ds.themCongNhan(new CongNhan("CN001", "Nguyen Gia", "Vi", 150));
        ds.themCongNhan(new CongNhan("CN002", "Phan Tran Thao", "Vy", 250));
        ds.themCongNhan(new CongNhan("CN003", "Dang The", "Phuc", 450));
        ds.themCongNhan(new CongNhan("CN004", "Nguyen Hoang", "Bao", 600));
        ds.themCongNhan(new CongNhan("CN005", "Tran Thao", "Tram", 180));

        int choice;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Hiển thị danh sách công nhân");
            System.out.println("2. Thêm công nhân");
            System.out.println("3. Xóa công nhân");
            System.out.println("4. Hiển thị công nhân làm trên 200 sản phẩm");
            System.out.println("5. Sắp xếp công nhân theo số sản phẩm giảm dần");
            System.out.println("6. Thoát");
            System.out.print("Chọn một tùy chọn: ");

            choice = scanner.nextInt();
            scanner.nextLine();
                switch (choice) {
                    case 1:
                    System.out.println("Danh sách công nhân:");
                    System.out.println(ds);
                    break;
                    case 2:
                    System.out.print("Nhập mã công nhân: ");
                    String maCN = scanner.nextLine();
                    System.out.print("Nhập họ: ");
                    String ho = scanner.nextLine();
                    System.out.print("Nhập tên: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhập số sản phẩm: ");
             int soSP = scanner.nextInt();
             scanner.nextLine();
                        
                    if (ds.themCongNhan(new CongNhan(maCN, ho, ten, soSP))) {
                    System.out.println("Thêm thành công.");
                    } else {
                    System.out.println("Danh sách đã đầy, không thể thêm.");
                    }
                    break;
                    case 3:
                    System.out.print("Nhập mã công nhân cần xóa: ");
                    String maCNCanXoa = scanner.nextLine();
                    if (ds.xoaCongNhan(maCNCanXoa)) {
                    System.out.println("Xóa thành công.");
                    } else {
                    System.out.println("Không tìm thấy.");
                    }
                    break;
                    case 4:
                    System.out.println("Danh sách công nhân làm trên 200 sản phẩm:");
                    CongNhan[] danhSachTren200 = ds.layDanhSachTren200SP();
                    if (danhSachTren200.length > 0) {
                    System.out.println(String.format("%-10s %-15s %-15s %-10s %-10s", "Mã CN", "Họ", "Tên", "Số SP", "Lương"));
                    for (int i = 0; i < 60; i++) {
                    System.out.print("-");
                    }
                    System.out.println();
                    for (CongNhan cn : danhSachTren200) {
                    System.out.printf("%-10s %-15s %-15s %-10d %-10.2f%n",cn.getMaCN(),cn.getHo(),cn.getTen(),cn.getSoSP(),cn.tinhLuong());
                    }
                    } else {
                    System.out.println("Không có công nhân nào làm trên 200 sản phẩm.");
                    }
                    break;
                    case 5:
                    ds.sapXepTheoSoSP();
                    System.out.println("Danh sách công nhân sau khi sắp xếp theo số sản phẩm giảm dần:");
                    System.out.println(ds);
                    break;
                    case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                    default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
                }         
        } while (choice != 6);

        scanner.close();
    }
}
