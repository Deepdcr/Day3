
public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera cam1 = new Camera(12,"SONY",13,35000,"aaa","sss",15);
		Camera cam2 = new Camera(13,"canon",16,36000,"bbb","rrr",20);
		Camera cam3 = new Camera(14,"nikon",15,37000,"ccc","rrr",25);
		
		cam1.printCameraDetails();
		cam2.printCameraDetails();
		cam3.printCameraDetails();
		
		cam1.click();
		
	}

}
class Camera
{
	int cameraId;
	String cameraBrand;
	int megaPixel;
	float cost;
	Lens lens;
		
	
	public Camera(int cameraId, String cameraBrand, int megaPixel, float cost, String lb, String lt, int lid) {
		super();
		this.cameraId = cameraId;
		this.cameraBrand = cameraBrand;
		this.megaPixel = megaPixel;
		this.cost = cost;
		this.lens = new Lens(lb,lt,lid);
	}
	void printCameraDetails()
	{
		System.out.println("Camera Id is :"+cameraId);
		System.out.println("Camera brand is :"+cameraBrand);
		System.out.println("Camera megapixel is :"+megaPixel);
		System.out.println("Camera Id is :"+cost);
		lens.printLensDetails();
		System.out.println("----------------");
			
	}


	public int getCameraId() {
		return cameraId;
	}



	public void setCameraId(int cameraId) {
		this.cameraId = cameraId;
	}



	public String getCameraBrand() {
		return cameraBrand;
	}



	public void setCameraBrand(String cameraBrand) {
		this.cameraBrand = cameraBrand;
	}



	public int getMegaPixel() {
		return megaPixel;
	}



	public void setMegaPixel(int megaPixel) {
		this.megaPixel = megaPixel;
	}



	public float getCost() {
		return cost;
	}



	public void setCost(float cost) {
		this.cost = cost;
	}



	public Lens getLens() {
		return lens;
	}



	public void setLens(Lens lens) {
		this.lens = lens;
	}
	
	@Override
	public String toString() {
		return "Camera [cameraId=" + cameraId + ", cameraBrand=" + cameraBrand + ", megaPixel=" + megaPixel + ", cost="
				+ cost + ", lens=" + lens + "]";
	}
	void click()
	{
		lens.zoomIn();
		System.out.println("clicking......");
		lens.zoomOut();
	}
	
	
	
}
class Lens
{
	String lensBrand;
	String lensType;
	int lensId;
	public Lens(String lensBrand, String lensType, int lensId) {
		super();
		this.lensBrand = lensBrand;
		this.lensType = lensType;
		this.lensId = lensId;
	}
	void printLensDetails()
	{
		System.out.println("Lens Id is    :"+lensId);
		System.out.println("Lens brand is :"+lensBrand);
		System.out.println("Lens type is  :"+lensType);
	}
	public String getLensBrand() {
		return lensBrand;
	}
	public void setLensBrand(String lensBrand) {
		this.lensBrand = lensBrand;
	}
	public String getLensType() {
		return lensType;
	}
	public void setLensType(String lensType) {
		this.lensType = lensType;
	}
	public int getLensId() {
		return lensId;
	}
	public void setLensId(int lensId) {
		this.lensId = lensId;
	}
	
	@Override
	public String toString() {
		return "Lens [lensBrand=" + lensBrand + ", lensType=" + lensType + ", lensId=" + lensId + "]";
	}
	void zoomIn()
	{
		System.out.println("zooming in.........");
	}
	void zoomOut()
	{
		System.out.println("zooming out.........");
	}
}