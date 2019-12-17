package javaweb.pojo;

public class Product {
	private String pNo="";
	private String pName="";
	private int pNumber=0;
	private String pUrl="";
	private String pIntroduce="";
	private double pMoney=0;
	private int pType=0;
	private String pDetail="";
	private String pUrl2="";
	private int exist=1;
	public int getpType() {
		return pType;
	}
	public void setpType(int pType) {
		this.pType = pType;
	}
	public String getpDetail() {
		return pDetail;
	}
	public void setpDetail(String pDetail) {
		this.pDetail = pDetail;
	}
	public int getExist() {
		return exist;
	}
	public void setExist(int exist) {
		this.exist = exist;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpNumber() {
		return pNumber;
	}
	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}
	public String getpUrl() {
		return pUrl;
	}
	public void setpUrl(String pUrl) {
		this.pUrl = pUrl;
	}
	public String getpIntroduce() {
		return pIntroduce;
	}
	public void setpIntroduce(String pIntroduce) {
		this.pIntroduce = pIntroduce;
	}
	public double getpMoney() {
		return pMoney;
	}
	public void setpMoney(double pMoney) {
		this.pMoney = pMoney;
	}
	public String getpUrl2() {
		return pUrl2;
	}
	public void setpUrl2(String pUrl2) {
		this.pUrl2 = pUrl2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + exist;
		result = prime * result + ((pDetail == null) ? 0 : pDetail.hashCode());
		result = prime * result + ((pIntroduce == null) ? 0 : pIntroduce.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pMoney);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((pName == null) ? 0 : pName.hashCode());
		result = prime * result + ((pNo == null) ? 0 : pNo.hashCode());
		result = prime * result + pNumber;
		result = prime * result + pType;
		result = prime * result + ((pUrl == null) ? 0 : pUrl.hashCode());
		result = prime * result + ((pUrl2 == null) ? 0 : pUrl2.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (exist != other.exist)
			return false;
		if (pDetail == null) {
			if (other.pDetail != null)
				return false;
		} else if (!pDetail.equals(other.pDetail))
			return false;
		if (pIntroduce == null) {
			if (other.pIntroduce != null)
				return false;
		} else if (!pIntroduce.equals(other.pIntroduce))
			return false;
		if (Double.doubleToLongBits(pMoney) != Double.doubleToLongBits(other.pMoney))
			return false;
		if (pName == null) {
			if (other.pName != null)
				return false;
		} else if (!pName.equals(other.pName))
			return false;
		if (pNo == null) {
			if (other.pNo != null)
				return false;
		} else if (!pNo.equals(other.pNo))
			return false;
		if (pNumber != other.pNumber)
			return false;
		if (pType != other.pType)
			return false;
		if (pUrl == null) {
			if (other.pUrl != null)
				return false;
		} else if (!pUrl.equals(other.pUrl))
			return false;
		if (pUrl2 == null) {
			if (other.pUrl2 != null)
				return false;
		} else if (!pUrl2.equals(other.pUrl2))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [pNo=" + pNo + ", pName=" + pName + ", pNumber=" + pNumber + ", pUrl=" + pUrl + ", pIntroduce="
				+ pIntroduce + ", pMoney=" + pMoney + ", pType=" + pType + ", pDetail=" + pDetail
				+ ", pUrl2=" + pUrl2 + ", exist=" + exist + "]";
	}
	public Product(String pNo, String pName, int pNumber, String pUrl, String pIntroduce, double pMoney, int pType,
			String pDetail, String pUrl2, int exist) {
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.pNumber = pNumber;
		this.pUrl = pUrl;
		this.pIntroduce = pIntroduce;
		this.pMoney = pMoney;
		this.pType = pType;
		this.pDetail = pDetail;
		this.pUrl2 = pUrl2;
		this.exist = exist;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
