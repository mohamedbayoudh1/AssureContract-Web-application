package tn.esprit.kaddem.entity;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_CONTRAT")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contrat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_ID")
    private Long id; // Identifiant  (Clé primaire)
    @Column(name = "C_MATRICULE")
    private String matricule;
    @Temporal(TemporalType.DATE)
    private Date dateEffet;
    @Enumerated(EnumType.STRING)
    private TypeContrat type;



}
