/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Eduardo
 */
public class Mensagem {
    private static final long serialVersionUID = 1L;
	private String message;
	private User from;
	private User to;
	private boolean readed = false;

	public String getMensagem() {
            return message;
	}

	public void setMensagem(String message) {
            this.message = message;
	}

	public boolean isReaded() {
            return readed;
	}

	public void setReaded(boolean readed) {
            this.readed = readed;
	}

	public User getFrom() {
            return from;
	}

	public void setFrom(User from) {
            this.from = from;
	}

	public User getTo() {
		return to;
	}

	public void setTo(User to) {
		this.to = to;
	}
}
