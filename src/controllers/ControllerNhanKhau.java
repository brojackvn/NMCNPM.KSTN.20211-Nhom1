package controllers;

public class ControllerNhanKhau {
    //Ví dụ:
    /*
    // Tham số truyền vào: Student (đầy đủ các thuộc tính của student)
    // Trả về: true nếu update thành công và ngược lại
    // Dùng để chèn một student vào database
    // Người tạo: Hồ Anh
    public boolean insert(Student student) throws SQLException, ClassNotFoundException{
        String sql = "INSERT INTO `sinhvien`(`MaSV`, `HoTen`, `Email`, `SoDT`, `GioiTinh`, `DiaChi`) VALUES (?,?,?,?,?,?)";
        try (
                Connection connection = DatabaseHelper.openConnection();
                PreparedStatement pstm = connection.prepareStatement(sql);
        ) {
            pstm.setString(1,student.getMaSV());
            pstm.setString(2, student.getHoTen());
            pstm.setString(3, student.getEmail());
            pstm.setString(4, student.getSoDT());
            pstm.setInt(5, student.getGioiTinh());
            pstm.setString(6, student.getDiaChi());
            return (pstm.executeUpdate() > 0 ? true : false);
        }
    }
    */  
}
