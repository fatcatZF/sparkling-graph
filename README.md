# sparkling-graph
[![Build Status](https://travis-ci.org/sparkling-graph/sparkling-graph.svg?branch=master)](https://travis-ci.org/sparkling-graph/sparkling-graph) [![codecov](https://codecov.io/gh/sparkling-graph/sparkling-graph/branch/master/graph/badge.svg)](https://codecov.io/gh/sparkling-graph/sparkling-graph) [![Documentation Status](https://readthedocs.org/projects/sparkling-graph/badge/?version=latest&cache=1234)](http://sparkling-graph.readthedocs.org/en/latest/?badge=latest) [![Codacy Badge](https://api.codacy.com/project/badge/grade/9ddff907e39a431485fecaf0f612a528)](https://www.codacy.com/app/riomus/sparkling-graph) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/ml.sparkling/sparkling-graph-examples_2.12/badge.svg)](https://maven-badges.herokuapp.com/maven-central/ml.sparkling/sparkling-graph-examples_2.12) [![MLOSS](https://img.shields.io/badge/MLOSS-0.0.7-brightgreen.svg)](https://mloss.org/software/view/650/) [![Spark Packages](https://img.shields.io/badge/Spark%20Packages-0.0.7-brightgreen.svg)](http://spark-packages.org/package/sparkling-graph/sparkling-graph) [![API](https://img.shields.io/badge/API-latest-brightgreen.svg)](http://sparkling-graph.github.io/sparkling-graph/latest/api/) [![Gitter](https://badges.gitter.im/sparkling-graph/sparkling-graph.svg)](https://gitter.im/sparkling-graph/sparkling-graph?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Fsparkling-graph%2Fsparkling-graph.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2Fsparkling-graph%2Fsparkling-graph?ref=badge_shield)

SparklingGraph provides easy to use set of features that will give you ability to proces large scala graphs using Spark and GraphX.

# Requirements

 - Scala 2.11 or 2.12
 - Spark 2.4.0  (or compatible)

# Versioning

Since commit `3246714` project is using git versioning (for example `0.0.7+140-32467140` or `0.0.7+140-32467140+20190402-2057-SNAPSHOT`). All artifacts from now one will be published to snapshot without version overriding. New approach will also add abbility to reproduce each version. Release versions will use normal tag based approach.

# Dependencies

Since commit `3246714` you can get artifacts for any master branch commits using `git describe` command. 

## Snapshot
```
resolvers +=  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
```
```
// one or all from:
libraryDependencies += "ml.sparkling" %% "sparkling-graph-examples" % "0.0.8-SNAPSHOT"
libraryDependencies += "ml.sparkling" %% "sparkling-graph-loaders" % "0.0.8-SNAPSHOT"
libraryDependencies += "ml.sparkling" %% "sparkling-graph-operators" % "0.0.8-SNAPSHOT"
```
## Release

```
// one or all from:
libraryDependencies += "ml.sparkling" %% "sparkling-graph-examples" % "0.0.7"
libraryDependencies += "ml.sparkling" %% "sparkling-graph-loaders" % "0.0.7"
libraryDependencies += "ml.sparkling" %% "sparkling-graph-operators" % "0.0.7"
```

# Current features

* Loading
  * Formats: 
    * CSV
    * GraphML
  * DSL
* Measures -  measures can be configured to treat graphs as directed and undirected
  * Measures DSL - easy to use domain specific language that boost productivity of library
  * Graph
    * Modularity
    * Freeman's network centrality
  * Vertex
    *  Closeness
    *  Local clustering
    *  Eigenvector
    *  Hits
    *  Neighbor connectivity
    *  Vertex embeddedness
    * Betweenness
      * Edmonds
      * Flow
      * Hua
  * Edges
    * Adamic/Adar
    * Common neighbours
* Comunity detection methods
  * PSCAN (SCAN)
* Graph coarsening
  * Label Propagation based
* Link prediction
  * Similarity measure based
* Generators
  * Ring
  * Watts And Strogatz
* Experiments
  *  Describe graph using all measures to CSV files

# Planned features
* Loading
  *  GML
* Measures
  * Katz
* Comunity detection methods
  * Modularity maximization
  * Infomap
* More Generators
* API
  *  Random walk
  *  BFS
* ML
  *  Vertex classification
 
# Used by

<a href="http://www.miniclip.com"><img src="http://vignette2.wikia.nocookie.net/logopedia/images/d/d3/Miniclip.svg/revision/latest?cb=20140406121232" width=250px/></a> <a href="http://datasciencegroup.pl/"><img src="http://datasciencegroup.pl/assets/images/logo-dsg.png" width=250px/></a> <a href="http://pwr.edu.pl"><img src="https://iwa-ywp.eu/wp-content/uploads/2015/11/%E2%80%8Ewww.portal.pwr_.wroc_.pl-files-prv-id24-logotypy-LogotypPWr-logo-PWr-pion-poziom_wszystkie_pl-en_2016.pdf-Safari-Today-at-18.17.03.png" width=250px /></a>

# Supported by:

<a href="https://www.jetbrains.com/buy/opensource/"><img src="https://sos-software.com/wp-content/uploads/Jetbrains_logo.png" width=100px /></a> provides us awesome IDE
 
# How to

Please check [API](http://sparkling-graph.github.io/sparkling-graph/latest/api/), [examples](https://github.com/sparkling-graph/sparkling-graph/tree/master/examples/src/main/scala/ml/sparkling/graph/examples) or [docs](http://sparkling-graph.readthedocs.org/en/latest/)



# Citation
If you use SparklingGraph in your research and publish it, please consider citing us, it will help us get funding for making the library better.
Currently manuscript is in preparation, so please us following references:

 ``` Bartusiak et al. (2017). SparklingGraph: large scale, distributed graph processing made easy. Manuscript in preparation. ```
 
 ```
@unpublished{sparkling-graph
title={SparklingGraph: large scale, distributed graph processing made easy},
author={Bartusiak R., Kajdanowicz T.},
note = {Manuscript in preparation},
year = {2017}
}
```


## License
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Fsparkling-graph%2Fsparkling-graph.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2Fsparkling-graph%2Fsparkling-graph?ref=badge_large)
