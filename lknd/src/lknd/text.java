package lknd;
class nd{
	public Object data;
	public nd next;
	public nd(Object o) {
		data = o;
	}
}
class lknd{
	nd h;
	public void crtlk(Object o [] ) {
		nd p1,p2;
		if(o.length==0)return;
			h = new nd(o[0]);
			p1=p2=h;
		for(int i=1;i<o.length;i++) {
				p1=new nd(o[i]);
				p2.next = p1;
				p2  = p1;
		}
	}
    public void innd(int n,nd newnd) {
    	if(n==0||h==null) {
    		newnd.next=h;
        	h=newnd;
        	return;
    	}
    	nd p=h;
    	for(int i = 1;i<n&&p.next!=null;i++) {
    		p=p.next;
    	}
    	newnd.next=p.next;
    	p.next=newnd;
    }
    public void delete(int n) {
    	if(h==null) {
    		return;
    	}
    	if(n==0) {
    		h=h.next;
    		return;
    	}
    	nd ndd = h;
    	for(int i = 1;i<n&&ndd.next.next!=null;i++) {
    		ndd=ndd.next;
    	}
    	ndd.next=ndd.next.next;
    }
    public void bianli() {
    	nd n = h;
    	while(n!=null) {
    		System.out.println(n.data);
    		n=n.next;
    	}
    }
}
public class text {
	public static void main(String [] args) {
		lknd l = new lknd();
		Number a[]= {
				
		};
		l.crtlk(a);
		Integer b  = 5;
		nd c = new nd(b);
		l.innd(1,c);
		l.innd(1,new nd(new Double(3)));
		l.bianli();
		l.delete(2);
		l.bianli();
	}
}
