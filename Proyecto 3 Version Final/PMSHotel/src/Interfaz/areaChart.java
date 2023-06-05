package Interfaz;

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import mundo.Biblioteca;
import mundo.Servicio;

import org.jfree.chart.ChartUtilities;

import javax.swing.JFrame;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.jfree.chart.title.TextTitle;


public class areaChart extends JFrame {

    JFreeChart chart; //declarar un objeto de la clase JFreeChart para construir el grafico
    ArrayList<Servicio> servicios;
    
    public areaChart() {
        //crear el JFrame
        super("Ejemplo de AreaChart");
        setSize(800, 600);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Biblioteca biblioteca = new Biblioteca();
        servicios = biblioteca.getServicios();
        crearGrafico(); 

        ChartPanel panel = new ChartPanel(chart, false); 
        panel.setBounds(10, 20, 760, 520); 
        add(panel); 

        setVisible(true); 
    }

    public void crearGrafico() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 

        for (Servicio servicio : servicios) {
            int ventas = servicio.getVentas();
            String mes = servicio.getMes(); // Supongamos que tienes un método en Servicio para obtener el mes de la venta
            dataset.addValue(ventas, "Ventas Totales", mes);
        }
        

        chart = ChartFactory.createAreaChart(
                "Ventas Totales", //titulo del grafico
                "Meses", //etiqueta de x
                "Ventas", //etiqueta de y
                dataset, //datos
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
        
        
        TextTitle subtitle1 = new TextTitle("Subtitle Demo");
	chart.addSubtitle(subtitle1);
        chart.setBorderVisible(true);
	chart.setBorderPaint(Color.red); // You can set any color as border here.
             
        
        try {
             
            ChartUtilities.saveChartAsPNG(
            //ChartUtilities.saveChartAsJPEG(
                    //damos la ubicacion donde se guardara la imagen, y su extension
                    new File("D:" + File.separator + "NombreGrafica.png"), //la ruta y el nombre de la imagen a crear
                    chart, //la grafica
                    800,//ancho 
                    700);//alto

        } catch (IOException e) {
            System.err.println("Error creando grafico.");
        }
    }

    public static void main(String[] args) {
        areaChart ac = new areaChart();
    }
}
