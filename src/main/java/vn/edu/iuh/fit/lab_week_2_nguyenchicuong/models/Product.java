package vn.edu.iuh.fit.lab_week_2_nguyenchicuong.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.lab_week_2_nguyenchicuong.enums.ProductStatus;

import java.io.Serializable;
import java.util.List;
@Entity
@Table(name = "product")
public class Product implements  Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id",unique = true,nullable = false)
    private long product_id;
    @Column(name = "description",columnDefinition = "varchar(250)")
    private String description;
    @Column(name = "manufactuner_name",columnDefinition = "varchar(100)")
    private String manufactuner;
    @Column(name = "name",columnDefinition = "varchar(150)")
    private String name;
    @Enumerated(EnumType.ORDINAL) // Đánh dấu là sử dụng Enum
    @Column(name = "status",columnDefinition = "int(11)")
    private ProductStatus status;
    @Column(name = "unit",columnDefinition = "varchar(25)")
    private String unit;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductImage> images;




}
