package quan.dev;

public class JavaOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String arrName[] = {"Hai", "Binh", "Nam"};
		final double arrToan[] = {5, 8, 9};
		final double arrLy[] = {7, 6, 8};
		final double arrHoa[] = {6, 7, 8};
		SinhVien arrSinhVien[] = new SinhVien[arrName.length];
		for(int i = 0; i < arrSinhVien.length; i++) {
			SinhVien sv = new SinhVien(arrName[i], arrToan[i], arrLy[i], arrHoa[i]);
				arrSinhVien[i]=sv;
		}
		for(int i = 0; i < arrSinhVien.length; i++) {
			if(arrSinhVien[i].diemTrungBinh(arrToan[i], arrLy[i], arrHoa[i]) > 8) {
				arrSinhVien[i].show();
			}
		}

	}

}
