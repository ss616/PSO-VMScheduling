package org.VMscheduling.pso;

/* author: harsh jain */

// this is an interface to keep the configuration for the PSO
// you can modify the value depends on your needs

public interface PSOConstants {
	int SWARM_SIZE = 30;
	int MAX_ITERATION = 100;
	int PROBLEM_DIMENSION = 2;
	double C1 = 2.0;
	double C2 = 2.0;
	double W_UPPERBOUND = 1.0;
    int NO_OF_PM = 100;
    int POP = 500;
    int NO_OF_VM = 100;
    int SEED = 0;
	double W_LOWERBOUND = 0.0;
}
