package com.mh.interfaces;

import com.mh.pojo.Helado;
import java.util.List;

public interface HeladoDAO {
    
    public Helado getHeladoByPosicion(String pos) throws Exception;
    
    public int updateHelado(Helado h) throws Exception;
    
    public List<Helado> getHelados() throws Exception;
    
   
}
