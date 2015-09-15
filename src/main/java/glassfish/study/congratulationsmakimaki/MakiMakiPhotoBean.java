/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glassfish.study.congratulationsmakimaki;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "makiMakiPhotoBean")
@RequestScoped
public class MakiMakiPhotoBean implements Serializable{
    
    @Getter @Setter
    private List<String> listPhotos;
    
    @Getter @Setter
    private String effect;
    
    @Getter @Setter
    private List<String> listEffect;
    
    @PostConstruct
    public void init(){
        listPhotos = Arrays.asList("1.jpg","126.jpg","23.jpg", "264.jpg", "49.jpg", "8.jpg");
        listEffect = Arrays.asList("fade", "zoom", "turnDown", "wipe");
        effect = listEffect.get(0);
    }
}
