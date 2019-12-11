package br.com.pamcary.api.evento.dao.model;



import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class ViagemModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private long ctlPlvia;
	private int ctlOperatip;
	private String desOperaTip;
	private long ctlTrnsp;
	private String nomTrnsp;
	private int sitPlvia;
	private Timestamp dhrPosicUlt;
	private String desPracaUlt;
	private double numLatitUlt;
	private double numLongiUlt;
	private Timestamp dhrInclu;
	private String nomUserInc;
	private int tipRastr;
	private double vlrTotalEmb;
	private int tipOperaVie;
	private Timestamp dhrAtviePln;
	private String codAtvieUsu;
	private Timestamp dhrPosicPrm;
	private double numLatitPrm;
	private double numLongiPrm;
	private String desPosicPrm;
	private int qtdDistaTot;
	private int numSinis;
	private String desOperaVie;
	private String desTipRast;
	private String desPlvia;
	private List<RoteiroViagemModel> eventos;
	private List<MotoristaViagemModel> motoristas;
	private List<VeiculoViagemModel> veiculos;
	private String semEventos;
	private String dispositivoCompl;
	private String tecnologiaCompl;
	private String tipoCompl;
	private String modeloCompl;
	private String classCompl;

	public long getCtlPlvia() {
		return this.ctlPlvia;
	}

	public void setCtlPlvia(long ctlPlvia) {
		this.ctlPlvia = ctlPlvia;
	}

	public int getCtlOperatip() {
		return this.ctlOperatip;
	}

	public void setCtlOperatip(int ctlOperatip) {
		this.ctlOperatip = ctlOperatip;
	}

	public String getDesOperaTip() {
		return this.desOperaTip;
	}

	public void setDesOperaTip(String desOperaTip) {
		this.desOperaTip = desOperaTip;
	}

	public long getCtlTrnsp() {
		return this.ctlTrnsp;
	}

	public void setCtlTrnsp(long ctlTrnsp) {
		this.ctlTrnsp = ctlTrnsp;
	}

	public String getNomTrnsp() {
		return this.nomTrnsp;
	}

	public void setNomTrnsp(String nomTrnsp) {
		this.nomTrnsp = nomTrnsp;
	}

	public int getSitPlvia() {
		return this.sitPlvia;
	}

	public void setSitPlvia(int sitPlvia) {
		this.sitPlvia = sitPlvia;
	}

	public Timestamp getDhrPosicUlt() {
		return this.dhrPosicUlt;
	}

	public void setDhrPosicUlt(Timestamp dhrPosicUlt) {
		this.dhrPosicUlt = dhrPosicUlt;
	}

	public String getDesPracaUlt() {
		return this.desPracaUlt;
	}

	public void setDesPracaUlt(String desPracaUlt) {
		this.desPracaUlt = desPracaUlt;
	}

	public double getNumLatitUlt() {
		return this.numLatitUlt;
	}

	public void setNumLatitUlt(double numLatitUlt) {
		this.numLatitUlt = numLatitUlt;
	}

	public double getNumLongiUlt() {
		return this.numLongiUlt;
	}

	public void setNumLongiUlt(double numLongiUlt) {
		this.numLongiUlt = numLongiUlt;
	}

	public Timestamp getDhrInclu() {
		return this.dhrInclu;
	}

	public void setDhrInclu(Timestamp dhrInclu) {
		this.dhrInclu = dhrInclu;
	}

	public String getNomUserInc() {
		return this.nomUserInc;
	}

	public void setNomUserInc(String nomUserInc) {
		this.nomUserInc = nomUserInc;
	}

	public int getTipRastr() {
		return this.tipRastr;
	}

	public void setTipRastr(int tipRastr) {
		this.tipRastr = tipRastr;
	}

	public double getVlrTotalEmb() {
		return this.vlrTotalEmb;
	}

	public void setVlrTotalEmb(double vlrTotalEmb) {
		this.vlrTotalEmb = vlrTotalEmb;
	}

	public int getTipOperaVie() {
		return this.tipOperaVie;
	}

	public void setTipOperaVie(int tipOperaVie) {
		this.tipOperaVie = tipOperaVie;
	}

	public Timestamp getDhrAtviePln() {
		return this.dhrAtviePln;
	}

	public void setDhrAtviePln(Timestamp dhrAtviePln) {
		this.dhrAtviePln = dhrAtviePln;
	}

	public String getCodAtvieUsu() {
		return this.codAtvieUsu;
	}

	public void setCodAtvieUsu(String codAtvieUsu) {
		this.codAtvieUsu = codAtvieUsu;
	}

	public Timestamp getDhrPosicPrm() {
		return this.dhrPosicPrm;
	}

	public void setDhrPosicPrm(Timestamp dhrPosicPrm) {
		this.dhrPosicPrm = dhrPosicPrm;
	}

	public double getNumLatitPrm() {
		return this.numLatitPrm;
	}

	public void setNumLatitPrm(double numLatitPrm) {
		this.numLatitPrm = numLatitPrm;
	}

	public double getNumLongiPrm() {
		return this.numLongiPrm;
	}

	public void setNumLongiPrm(double numLongiPrm) {
		this.numLongiPrm = numLongiPrm;
	}

	public String getDesPosicPrm() {
		return this.desPosicPrm;
	}

	public void setDesPosicPrm(String desPosicPrm) {
		this.desPosicPrm = desPosicPrm;
	}

	public int getQtdDistaTot() {
		return this.qtdDistaTot;
	}

	public void setQtdDistaTot(int qtdDistaTot) {
		this.qtdDistaTot = qtdDistaTot;
	}

	public int getNumSinis() {
		return this.numSinis;
	}

	public void setNumSinis(int numSinis) {
		this.numSinis = numSinis;
	}

	public String getDesOperaVie() {
		return this.desOperaVie;
	}

	public void setDesOperaVie(String desOperaVie) {
		this.desOperaVie = desOperaVie;
	}

	public String getDesTipRast() {
		return this.desTipRast;
	}

	public void setDesTipRast(String desTipRast) {
		this.desTipRast = desTipRast;
	}

	public String getDesPlvia() {
		return this.desPlvia;
	}

	public void setDesPlvia(String desPlvia) {
		this.desPlvia = desPlvia;
	}

	public List<RoteiroViagemModel> getEventos() {
		return this.eventos;
	}

	public void setEventos(List<RoteiroViagemModel> eventos) {
		this.eventos = eventos;
	}

	public String getSemEventos() {
		return this.semEventos;
	}

	public void setSemEventos(String semEventos) {
		this.semEventos = semEventos;
	}

	public List<MotoristaViagemModel> getMotoristas() {
		return this.motoristas;
	}

	public void setMotoristas(List<MotoristaViagemModel> motoristas) {
		this.motoristas = motoristas;
	}

	public List<VeiculoViagemModel> getVeiculos() {
		return this.veiculos;
	}

	public void setVeiculos(List<VeiculoViagemModel> veiculos) {
		this.veiculos = veiculos;
	}

	public String getDispositivoCompl() {
		return this.dispositivoCompl;
	}

	public void setDispositivoCompl(String dispositivoCompl) {
		this.dispositivoCompl = dispositivoCompl;
	}

	public String getTecnologiaCompl() {
		return this.tecnologiaCompl;
	}

	public void setTecnologiaCompl(String tecnologiaCompl) {
		this.tecnologiaCompl = tecnologiaCompl;
	}

	public String getTipoCompl() {
		return this.tipoCompl;
	}

	public void setTipoCompl(String tipoCompl) {
		this.tipoCompl = tipoCompl;
	}

	public String getModeloCompl() {
		return this.modeloCompl;
	}

	public void setModeloCompl(String modeloCompl) {
		this.modeloCompl = modeloCompl;
	}

	public String getClassCompl() {
		return this.classCompl;
	}

	public void setClassCompl(String classCompl) {
		this.classCompl = classCompl;
	}

	public String toString() {
		return "ViagemModel [ctlPlvia=" + this.ctlPlvia + ", ctlOperatip=" + this.ctlOperatip + ", desOperaTip="
				+ this.desOperaTip + ", ctlTrnsp=" + this.ctlTrnsp + ", nomTrnsp=" + this.nomTrnsp + ", sitPlvia="
				+ this.sitPlvia + ", dhrPosicUlt=" + this.dhrPosicUlt + ", desPracaUlt=" + this.desPracaUlt
				+ ", numLatitUlt=" + this.numLatitUlt + ", numLongiUlt=" + this.numLongiUlt + ", dhrInclu="
				+ this.dhrInclu + ", nomUserInc=" + this.nomUserInc + ", tipRastr=" + this.tipRastr + ", vlrTotalEmb="
				+ this.vlrTotalEmb + ", tipOperaVie=" + this.tipOperaVie + ", dhrAtviePln=" + this.dhrAtviePln
				+ ", codAtvieUsu=" + this.codAtvieUsu + ", dhrPosicPrm=" + this.dhrPosicPrm + ", numLatitPrm="
				+ this.numLatitPrm + ", numLongiPrm=" + this.numLongiPrm + ", desPosicPrm=" + this.desPosicPrm
				+ ", qtdDistaTot=" + this.qtdDistaTot + ", numSinis=" + this.numSinis + ", desOperaVie="
				+ this.desOperaVie + ", desTipRast=" + this.desTipRast + ", desPlvia=" + this.desPlvia + ", eventos="
				+ this.eventos + ", motoristas=" + this.motoristas + ", veiculos=" + this.veiculos + ", semEventos="
				+ this.semEventos + ", dispositivoCompl=" + this.dispositivoCompl + ", tecnologiaCompl="
				+ this.tecnologiaCompl + ", tipoCompl=" + this.tipoCompl + ", modeloCompl=" + this.modeloCompl
				+ ", classCompl=" + this.classCompl + "]";
	}
}
