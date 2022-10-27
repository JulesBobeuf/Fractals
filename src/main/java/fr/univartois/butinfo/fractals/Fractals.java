/**
 * Ce logiciel est distribué à des fins éducatives.
 *
 * Il est fourni "tel quel", sans garantie d’aucune sorte, explicite
 * ou implicite, notamment sans garantie de qualité marchande, d’adéquation
 * à un usage particulier et d’absence de contrefaçon.
 * En aucun cas, les auteurs ou titulaires du droit d’auteur ne seront
 * responsables de tout dommage, réclamation ou autre responsabilité, que ce
 * soit dans le cadre d’un contrat, d’un délit ou autre, en provenance de,
 * consécutif à ou en relation avec le logiciel ou son utilisation, ou avec
 * d’autres éléments du logiciel.
 *
 * (c) 2022 Romain Wallon - Université d'Artois.
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals;

import java.io.PrintWriter;

import fr.cril.cli.ClassParser;
import fr.cril.cli.CliArgsParser;
import fr.cril.cli.CliOptionDefinitionException;
import fr.cril.cli.CliUsageException;
import fr.cril.cli.annotations.Args;
import fr.cril.cli.annotations.Description;
import fr.cril.cli.annotations.LongName;
import fr.cril.cli.annotations.ShortName;
import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.image.AdaptateurImage;
import fr.univartois.butinfo.fractals.image.IImageBuilder;
import fr.univartois.butinfo.fractals.image.ImageBuilder;
import fr.univartois.butinfo.fractals.image.Image;

/**
 * La classe Fractals permet de générer des fractales depuis la ligne de commande.
 *
 * @author Romain Wallon
 *
 * @version 0.1.0
 */
public final class Fractals {

    /**
     * L'option permettant d'afficher l'aide de l'application.
     */
    @LongName("help")
    @Description("Affiche l'aide du générateur de fractales.")
    @Args(0)
    private boolean help;

    /**
     * L'option spécifiant la largeur de l'image à générer.
     */
    @ShortName("w")
    @LongName("width")
    @Description("Spécifie la largeur de l'image à générer.")
    @Args(value = 1, names = "pixels")
    private int width;

    /**
     * L'option spécifiant la hauteur de l'image à générer.
     */
    @ShortName("h")
    @LongName("height")
    @Description("Spécifie la hauteur de l'image à générer.")
    @Args(value = 1, names = "pixels")
    private int height;

    /**
     * L'option spécifiant l'échelle à appliquer sur l'image.
     */
    @ShortName("s")
    @LongName("scale")
    @Description("Spécifie l'échelle à appliquer sur l'image.")
    @Args(value = 1, names = "ratio")
    private double scale;

    /**
     * L'option spécifiant le point central de l'image sur l'axe des abscisses.
     */
    @ShortName("x")
    @LongName("focus-x")
    @Description("Spécifie le point central de l'image sur l'axe des abscisses.")
    @Args(value = 1, names = "real")
    private double focusX;

    /**
     * L'option spécifiant le point central de l'image sur l'axe des ordonnées.
     */
    @ShortName("y")
    @LongName("focus-y")
    @Description("Spécifie le point central de l'image sur l'axe des ordonnées.")
    @Args(value = 1, names = "real")
    private double focusY;

    /**
     * L'option spécifiant le nom de la fractale à générer.
     */
    @ShortName("f")
    @LongName("fractal-name")
    @Description("Spécifie le nom de la fractale à générer.")
    @Args(value = 1, names = "name")
    private String fractaleName;

    /**
     * L'option spécifiant le nombre d'itérations à appliquer pour générer la fractale.
     */
    @ShortName("n")
    @LongName("nb-iterations")
    @Description("Spécifie le nombre d'itérations à appliquer pour générer la fractale.")
    @Args(value = 1, names = "integer")
    private int nbIterations;

    /**
     * L'option spécifiant le nom de la palette de couleurs à appliquer lors de la génération.
     */
    @ShortName("p")
    @LongName("palette-name")
    @Description("Spécifie le nom de la palette de couleurs à appliquer lors de la génération.")
    @Args(value = 1, names = "name")
    private String paletteName;

    /**
     * L'option spécifiant le nom du fichier dans lequel la fractale doit être sauvegardée.
     */
    @ShortName("o")
    @LongName("output")
    @Description("Spécifie le nom du fichier dans lequel la fractale doit être sauvegardée.")
    @Args(value = 1, names = "file")
    private String outputFile;

    /**
     * L'instance de {@link ClassParser} permettant de lire les arguments de la
     * ligne de commande pour initialiser les attributs de cet objet.
     */
    private final ClassParser<Fractals> classParser = new ClassParser<>(Fractals.class);

    /**
     * Empêche de créer une instance de Fractals en dehors de cette classe.
     */
    private Fractals() {
        // On ne fait rien ici.
    }

    /**
     * Lit les arguments donnés dans la ligne de commande.
     *
     * @param args Les arguments de la ligne de commande.
     */
    private void parseCliArguments(String[] args) {
        var argsParser = new CliArgsParser<>(classParser);

        try {
            argsParser.parse(this, args);

            if (help) {
                // Si l'aide est demandée, on affiche l'usage et on termine.
                usage();
                System.exit(0);
            }

        } catch (CliUsageException | CliOptionDefinitionException e) {
            usage();
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Affiche l'usage de l'application sur la sortie standard des erreurs.
     */
    public void usage() {
        System.err.println("gradle run --args='[options]'");
        System.err.println("java -jar <chemin/vers/le/jar> [options]");
        classParser.printOptionUsage(new PrintWriter(System.err));
    }

    /**
     * Crée la fractale demandée dans la ligne de commande.
     * @return 
     */
    public void buildFractal() {
        ImageBuilder image = new ImageBuilder();
        Image builder = new Image(image);
        //  AdaptateurImage img = new AdaptateurImage(image);
        image.setHeight(builder.buildHeight(height));
        image.setWidth(builder.buildWidth(width));
        image.setScale(builder.buildScale(scale));
        image.setComplex(builder.buildCenter(focusX,focusY));
        for (int wi=0;wi<=width;wi++) {
            for (int he=0;he<=height;he++) {
                image.setSuite(builder.buildSuite(fractaleName,wi,he));
            }
        }
        image.setPalette(builder.buildColors(paletteName, nbIterations));
        image.setFilepath(builder.buildFilePath(outputFile));
        image.setPlanComplexe(builder.buildPlanComplexe(image.getHeight(), image.getWidth()));
    }

    /**
     * Exécute l'application depuis la ligne de commande.
     *
     * @param args Les arguments de la ligne de commande.
     */
    public static void main(String[] args) {
        Fractals fractals = new Fractals();
        fractals.parseCliArguments(args);
        fractals.buildFractal();
    }

    
    /**
     * Donne l'attribut width de cette instance de Fractals.
     *
     * @return L'attribut width de cette instance de Fractals.
     */
    public int getWidth() {
        return width;
    }

    
    /**
     * Modifie l'attribut width de cette instance de Fractals.
     *
     * @param width La nouvelle valeur de l'attribut width pour cette instance de Fractals.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    
    /**
     * Donne l'attribut height de cette instance de Fractals.
     *
     * @return L'attribut height de cette instance de Fractals.
     */
    public int getHeight() {
        return height;
    }

    
    /**
     * Modifie l'attribut height de cette instance de Fractals.
     *
     * @param height La nouvelle valeur de l'attribut height pour cette instance de Fractals.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    
    /**
     * Donne l'attribut scale de cette instance de Fractals.
     *
     * @return L'attribut scale de cette instance de Fractals.
     */
    public double getScale() {
        return scale;
    }

    
    /**
     * Modifie l'attribut scale de cette instance de Fractals.
     *
     * @param scale La nouvelle valeur de l'attribut scale pour cette instance de Fractals.
     */
    public void setScale(double scale) {
        this.scale = scale;
    }

    
    /**
     * Donne l'attribut focusX de cette instance de Fractals.
     *
     * @return L'attribut focusX de cette instance de Fractals.
     */
    public double getFocusX() {
        return focusX;
    }

    
    /**
     * Modifie l'attribut focusX de cette instance de Fractals.
     *
     * @param focusX La nouvelle valeur de l'attribut focusX pour cette instance de Fractals.
     */
    public void setFocusX(double focusX) {
        this.focusX = focusX;
    }

    
    /**
     * Donne l'attribut focusY de cette instance de Fractals.
     *
     * @return L'attribut focusY de cette instance de Fractals.
     */
    public double getFocusY() {
        return focusY;
    }

    
    /**
     * Modifie l'attribut focusY de cette instance de Fractals.
     *
     * @param focusY La nouvelle valeur de l'attribut focusY pour cette instance de Fractals.
     */
    public void setFocusY(double focusY) {
        this.focusY = focusY;
    }

    
    /**
     * Donne l'attribut fractaleName de cette instance de Fractals.
     *
     * @return L'attribut fractaleName de cette instance de Fractals.
     */
    public String getFractaleName() {
        return fractaleName;
    }

    
    /**
     * Modifie l'attribut fractaleName de cette instance de Fractals.
     *
     * @param fractaleName La nouvelle valeur de l'attribut fractaleName pour cette instance de Fractals.
     */
    public void setFractaleName(String fractaleName) {
        this.fractaleName = fractaleName;
    }

    
    /**
     * Donne l'attribut nbIterations de cette instance de Fractals.
     *
     * @return L'attribut nbIterations de cette instance de Fractals.
     */
    public int getNbIterations() {
        return nbIterations;
    }

    
    /**
     * Modifie l'attribut nbIterations de cette instance de Fractals.
     *
     * @param nbIterations La nouvelle valeur de l'attribut nbIterations pour cette instance de Fractals.
     */
    public void setNbIterations(int nbIterations) {
        this.nbIterations = nbIterations;
    }

    
    /**
     * Donne l'attribut paletteName de cette instance de Fractals.
     *
     * @return L'attribut paletteName de cette instance de Fractals.
     */
    public String getPaletteName() {
        return paletteName;
    }

    
    /**
     * Modifie l'attribut paletteName de cette instance de Fractals.
     *
     * @param paletteName La nouvelle valeur de l'attribut paletteName pour cette instance de Fractals.
     */
    public void setPaletteName(String paletteName) {
        this.paletteName = paletteName;
    }

    
    /**
     * Donne l'attribut outputFile de cette instance de Fractals.
     *
     * @return L'attribut outputFile de cette instance de Fractals.
     */
    public String getOutputFile() {
        return outputFile;
    }

    
    /**
     * Modifie l'attribut outputFile de cette instance de Fractals.
     *
     * @param outputFile La nouvelle valeur de l'attribut outputFile pour cette instance de Fractals.
     */
    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }
    
    

}
