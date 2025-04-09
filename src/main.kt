import korlibs.event.*
import korlibs.image.atlas.*
import korlibs.image.tiles.*
import korlibs.time.*
import korlibs.korge.*
import korlibs.korge.scene.*
import korlibs.korge.tween.*
import korlibs.korge.view.*
import korlibs.image.color.*
import korlibs.image.format.*
import korlibs.io.file.std.*
import korlibs.korge.ldtk.view.*
import korlibs.korge.ui.*
import korlibs.korge.view.animation.*
import korlibs.korge.view.tiles.*
import korlibs.korge.virtualcontroller.*
import korlibs.math.geom.*
import korlibs.math.interpolation.*
import korlibs.memory.*

suspend fun main() = Korge(windowSize = Size(512, 512), backgroundColor = Colors["#466f46"]) {
	val sceneContainer = sceneContainer()

	sceneContainer.changeTo { MyScene() }
}


class MyScene : Scene() {

    val atlas = MutableAtlasUnit(2048,2048)
   // lateinit var tileMap: TileMap //carga el mapa
    lateinit var character: ImageDataContainer //carga el caracter  o caracteres



    override suspend fun SContainer.sceneInit(){
        val sw =Stopwatch().start()
        println("start resources loading...")

       val tileMap = resourcesVfs["BasicTileMap/mapa1.ldtk"].readLDTKWorld()
    }


	override suspend fun SContainer.sceneMain() {

    }
}
