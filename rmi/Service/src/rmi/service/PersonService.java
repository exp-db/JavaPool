package rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import rmi.model.*;

//��ΪԶ�̶�����õĽӿڣ�����̳�Remote��
public interface PersonService extends Remote {
    public List<PersonEntity> GetList() throws RemoteException;
}
