package br.com.pamcary.api.evento.exception;

import java.sql.Timestamp;
import java.util.List;

import br.com.pamcary.api.evento.dao.model.RoteiroViagemModel;

public class ExceptionResponse extends RuntimeException {

	private static final long serialVersionUID = -9039412616899180781L;

	private long ctlPlvia;
	private int ctlOperatip;
	private String desOperaTip;
	private long ctlTrnsp;
	private String nomTrnsp;
	private int sitPlvia;
	private Timestamp dhrPosicUlt;
	private String desPracaUlt;
	private int numLatitUlt;
	private int numLongiUlt;
	private Timestamp dhrInclu;
	private String nomUserInc;
	private int tipRastr;
	private int vlrTotalEmb;
	private int tipOperaVie;
	private Timestamp dhrAtviePln;
	private String codAtvieUsu;
	private Timestamp dhrPosicPrm;
	private int numLatitPrm;
	private int numLongiPrm;
	private String desPosicPrm;
	private int qtdDistaTot;
	private int numSinis;
	
	private String desOperaVie;
	private String desTipRast;
	private String desPlvia;
	
	private List<RoteiroViagemModel> eventos;

	
	
	
	
	public ExceptionResponse(long ctlPlvia, int ctlOperatip, String desOperaTip, long ctlTrnsp, String nomTrnsp,
			int sitPlvia, Timestamp dhrPosicUlt, String desPracaUlt, int numLatitUlt, int numLongiUlt,
			Timestamp dhrInclu, String nomUserInc, int tipRastr, int vlrTotalEmb, int tipOperaVie,
			Timestamp dhrAtviePln, String codAtvieUsu, Timestamp dhrPosicPrm, int numLatitPrm, int numLongiPrm,
			String desPosicPrm, int qtdDistaTot, int numSinis, String desOperaVie, String desTipRast, String desPlvia,
			List<RoteiroViagemModel> eventos) {
		super();
		this.ctlPlvia = ctlPlvia;
		this.ctlOperatip = ctlOperatip;
		this.desOperaTip = desOperaTip;
		this.ctlTrnsp = ctlTrnsp;
		this.nomTrnsp = nomTrnsp;
		this.sitPlvia = sitPlvia;
		this.dhrPosicUlt = dhrPosicUlt;
		this.desPracaUlt = desPracaUlt;
		this.numLatitUlt = numLatitUlt;
		this.numLongiUlt = numLongiUlt;
		this.dhrInclu = dhrInclu;
		this.nomUserInc = nomUserInc;
		this.tipRastr = tipRastr;
		this.vlrTotalEmb = vlrTotalEmb;
		this.tipOperaVie = tipOperaVie;
		this.dhrAtviePln = dhrAtviePln;
		this.codAtvieUsu = codAtvieUsu;
		this.dhrPosicPrm = dhrPosicPrm;
		this.numLatitPrm = numLatitPrm;
		this.numLongiPrm = numLongiPrm;
		this.desPosicPrm = desPosicPrm;
		this.qtdDistaTot = qtdDistaTot;
		this.numSinis = numSinis;
		this.desOperaVie = desOperaVie;
		this.desTipRast = desTipRast;
		this.desPlvia = desPlvia;
		this.eventos = eventos;
	}

	public long getCtlPlvia() {
		return ctlPlvia;
	}

	public void setCtlPlvia(long ctlPlvia) {
		this.ctlPlvia = ctlPlvia;
	}

	public int getCtlOperatip() {
		return ctlOperatip;
	}

	public void setCtlOperatip(int ctlOperatip) {
		this.ctlOperatip = ctlOperatip;
	}

	public String getDesOperaTip() {
		return desOperaTip;
	}

	public void setDesOperaTip(String desOperaTip) {
		this.desOperaTip = desOperaTip;
	}

	public long getCtlTrnsp() {
		return ctlTrnsp;
	}

	public void setCtlTrnsp(long ctlTrnsp) {
		this.ctlTrnsp = ctlTrnsp;
	}

	public String getNomTrnsp() {
		return nomTrnsp;
	}

	public void setNomTrnsp(String nomTrnsp) {
		this.nomTrnsp = nomTrnsp;
	}

	public int getSitPlvia() {
		return sitPlvia;
	}

	public void setSitPlvia(int sitPlvia) {
		this.sitPlvia = sitPlvia;
	}

	public Timestamp getDhrPosicUlt() {
		return dhrPosicUlt;
	}

	public void setDhrPosicUlt(Timestamp dhrPosicUlt) {
		this.dhrPosicUlt = dhrPosicUlt;
	}

	public String getDesPracaUlt() {
		return desPracaUlt;
	}

	public void setDesPracaUlt(String desPracaUlt) {
		this.desPracaUlt = desPracaUlt;
	}

	public int getNumLatitUlt() {
		return numLatitUlt;
	}

	public void setNumLatitUlt(int numLatitUlt) {
		this.numLatitUlt = numLatitUlt;
	}

	public int getNumLongiUlt() {
		return numLongiUlt;
	}

	public void setNumLongiUlt(int numLongiUlt) {
		this.numLongiUlt = numLongiUlt;
	}

	public Timestamp getDhrInclu() {
		return dhrInclu;
	}

	public void setDhrInclu(Timestamp dhrInclu) {
		this.dhrInclu = dhrInclu;
	}

	public String getNomUserInc() {
		return nomUserInc;
	}

	public void setNomUserInc(String nomUserInc) {
		this.nomUserInc = nomUserInc;
	}

	public int getTipRastr() {
		return tipRastr;
	}

	public void setTipRastr(int tipRastr) {
		this.tipRastr = tipRastr;
	}

	public int getVlrTotalEmb() {
		return vlrTotalEmb;
	}

	public void setVlrTotalEmb(int vlrTotalEmb) {
		this.vlrTotalEmb = vlrTotalEmb;
	}

	public int getTipOperaVie() {
		return tipOperaVie;
	}

	public void setTipOperaVie(int tipOperaVie) {
		this.tipOperaVie = tipOperaVie;
	}

	public Timestamp getDhrAtviePln() {
		return dhrAtviePln;
	}

	public void setDhrAtviePln(Timestamp dhrAtviePln) {
		this.dhrAtviePln = dhrAtviePln;
	}

	public String getCodAtvieUsu() {
		return codAtvieUsu;
	}

	public void setCodAtvieUsu(String codAtvieUsu) {
		this.codAtvieUsu = codAtvieUsu;
	}

	public Timestamp getDhrPosicPrm() {
		return dhrPosicPrm;
	}

	public void setDhrPosicPrm(Timestamp dhrPosicPrm) {
		this.dhrPosicPrm = dhrPosicPrm;
	}

	public int getNumLatitPrm() {
		return numLatitPrm;
	}

	public void setNumLatitPrm(int numLatitPrm) {
		this.numLatitPrm = numLatitPrm;
	}

	public int getNumLongiPrm() {
		return numLongiPrm;
	}

	public void setNumLongiPrm(int numLongiPrm) {
		this.numLongiPrm = numLongiPrm;
	}

	public String getDesPosicPrm() {
		return desPosicPrm;
	}

	public void setDesPosicPrm(String desPosicPrm) {
		this.desPosicPrm = desPosicPrm;
	}

	public int getQtdDistaTot() {
		return qtdDistaTot;
	}

	public void setQtdDistaTot(int qtdDistaTot) {
		this.qtdDistaTot = qtdDistaTot;
	}

	public int getNumSinis() {
		return numSinis;
	}

	public void setNumSinis(int numSinis) {
		this.numSinis = numSinis;
	}

	public String getDesOperaVie() {
		return desOperaVie;
	}

	public void setDesOperaVie(String desOperaVie) {
		this.desOperaVie = desOperaVie;
	}

	public String getDesTipRast() {
		return desTipRast;
	}

	public void setDesTipRast(String desTipRast) {
		this.desTipRast = desTipRast;
	}

	public String getDesPlvia() {
		return desPlvia;
	}

	public void setDesPlvia(String desPlvia) {
		this.desPlvia = desPlvia;
	}

	public List<RoteiroViagemModel> getEventos() {
		return eventos;
	}

	public void setEventos(List<RoteiroViagemModel> eventos) {
		this.eventos = eventos;
	}
	
	
}