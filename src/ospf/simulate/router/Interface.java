package ospf.simulate.router;

import ospf.simulate.util.InterfaceType;

public class Interface {

	public Interface(Router router, InterfaceType type, int number) {

		this.router = router;
		this.type = type;
		this.interfaceNumber = number;
	}

	public Router getRouter() {

		return router;
	}

	public IP getIp() {

		return ip;
	}

	public Link getLink() {

		return link;
	}

	public InterfaceType getType() {

		return type;
	}

	public int getInterfaceNumber() {

		return interfaceNumber;
	}

	public void setIp(IP ip) {

		this.ip = ip;
	}

	public void setLink(Link link) {

		this.link = link;
	}

	public String toString() {

		return this.router.toString() + "-" + this.getType() + "/"
				+ this.getInterfaceNumber();
	}

	public String getInterfaceInfo() {

		return this.getType() + "/" + this.getInterfaceNumber();
	}

	public String info() {

		return "[Interface: " + this.toString() + " -- " + ip + " -- " + link
				+ "]";
	}

	public boolean equals(Interface interface1) {

		if (this.getType() == interface1.getType()
				&& this.getInterfaceNumber() == interface1.getInterfaceNumber()
				&& this.getRouter().equals(interface1.getRouter())) {

			return true;
		}
		return false;
	}

	private Router router = null;
	private IP ip = null;
	private Link link = null;

	private InterfaceType type = null;
	private int interfaceNumber = 0;
}
