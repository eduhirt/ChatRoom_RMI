/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroom;

/**
 *
 * @author Eduardo
 */
public class ServerChat {
    //somente server pode fechar sala, com método closeRoom()
    //caso ainda tenham users na sala que vai ser fechada, servidor deve mandar mensagem "Sala fechada pelo servidor"
    //após fechada, a sala tem que ser removida da lista de salas tanto do servidor quanto dos clientes (quando recebe a msg)
    //servidor deve ser registrado no registro de RMI (rmiregistry) com o nome “Servidor” eu sar a porta “2020” para escutar clientes
    //deve executar na máquina do servidor
}
