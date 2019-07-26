# DBSCAN-related

1.chooseCluster(for 2d points,but can also be used in 3d with "point.java" file in DBSCAN_3d)
  input: Eps,MinPts,the special point
  outpot: The Cluster where the special point is located
  
  Experiment：
  data.txt: input points
  m3.txt: output cluster points
  
  
2.DBSCAN_2d
  input: points
  output: MinPts(k), k_distance graph, clusters
  
  Experiment：
  run for the first time
  get MinPts value suggestion and k_distance graph data
  then use k_distance graph to choose the value of Eps
  run for the second time with chosen Eps
  get result of clusters
  
  data2d.m: run initial data(in data2d.zip) on Matlab to see the points
  k_dist.m: run to see k_distance graph on Matlab (g3.txt)
  result2d.m: run to see clusters on Matlab (result2d.txt)
  data2d.txt: input points
  result2d.txt: output clusters
  g3.txt: k_distance graph data
  
  
3.DBSCAN_3d
  input: points
  output: MinPts(k), k_distance graph, clusters
  
  Experiment：
  run for the first time
  get MinPts value suggestion and k_distance graph data
  then use k_distance graph to choose the value of Eps
  run for the second time with chosen Eps
  get result of clusters
  
  data.m: run initial data(in dataIn3d.zip) on Matlab to see the points
  k_dist.m: run to see k_distance graph on Matlab (g2.txt/ g.txt)
  result.m: run to see clusters on Matlab (wineC.txt/ irisC.txt)
  wine.txt/ iris.txt: input points
  wineC.txt/ irisC.txt: output clusters
  g2.txt/ g.txt: k_distance graph data
  
