/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Eduardo
 */
public class User implements Serializable{
    //nome da sala e, após conhecer o nome, invocar o método remoto joinRoom(String usrName)
    //pode solicitar a criação de uma nova sala com createRoom(String roomName)
    //criar sala não faz com que o usuário automaticamente entre nela
    //após na sala, user manda mensagens com o mátodo sendMsg(String usrName, String msg)
    //deve ter método deliverMsg(String senderName, String msg) para receber mensagens
    //leaveRoom(String usrName) para sair da sala
    private static final long serialVersionUID = 1L;

	private int id;

	private String name;
	private String ip;
	private boolean connected = true;

	public User() {
	}

	// Construtor
	public User(String name, String ip) {
            this.name = name;
            this.ip = ip;
	}

	public int getId() {
            return id;
	}

	public void setId(int id) {
            this.id = id;
	}

	public boolean isConnected() {
            return connected;
	}

	public void disconnect() {
            this.connected = false;
	}

	public void connect() {
            this.connected = true;
	}

	public String getName() {
            return name;
	}

	public void setName(String name) {
            this.name = name;
	}

	public String getIp() {
            return ip;
	}

	public void setIp(String ip) {
            this.ip = ip;
	}
    
}
