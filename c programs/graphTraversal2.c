#include <stdio.h>

#define MAX_VERTICES 100

int graph[MAX_VERTICES][MAX_VERTICES];
int visited[MAX_VERTICES];
int queue[MAX_VERTICES];
int top = -1, front = -1, rear = -1;

void bfs(int start, int vertices) {
    int i;
    visited[start] = 1;
    queue[++rear] = start;

    while(front != rear) {
        start = queue[++front];
        printf("%d ", start);

        for(i = 0; i < vertices; i++) {
            if(graph[start][i] == 1 && visited[i] == 0) {
                visited[i] = 1;
                queue[++rear] = i;
            }
        }
    }
}

void dfs(int start, int vertices) {
    int i;
    printf("%d ", start);
    visited[start] = 1;

    for(i = 0; i < vertices; i++) {
        if(graph[start][i] == 1 && visited[i] == 0) {
            dfs(i, vertices);
        }
    }
}

int main() {
    int i, j, vertices, start;
    printf("Enter the number of vertices: ");
    scanf("%d", &vertices);
    printf("Enter the adjacency matrix:\n");

    for(i = 0; i < vertices; i++) {
        for(j = 0; j < vertices; j++) {
            scanf("%d", &graph[i][j]);
        }
    }

    printf("Enter the starting vertex for BFS: ");
    scanf("%d", &start);
    printf("BFS traversal: ");
    bfs(start, vertices);

    for(i = 0; i < vertices; i++) {
        visited[i] = 0;
    }

    printf("\nEnter the starting vertex for DFS: ");
    scanf("%d", &start);
    printf("DFS traversal: ");
    dfs(start, vertices);

    return 0;
}