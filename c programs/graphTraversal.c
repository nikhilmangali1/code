#include <stdio.h>
#include <stdlib.h>

#define MAX_VERTICES 100

typedef struct
{
    int data[MAX_VERTICES];
    int front, rear;
} Queue;

void initializeQueue(Queue *q)
{
    q->front = q->rear = 0;
}

int isQueueEmpty(Queue *q)
{
    return q->front == q->rear;
}

void enqueue(Queue *q, int item)
{
    q->data[q->rear++] = item;
}

int dequeue(Queue *q)
{
    return q->data[q->front++];
}

typedef struct Graph
{
    int numVertices;
    int adjMatrix[MAX_VERTICES][MAX_VERTICES];
} Graph;

void initializeGraph(Graph *g, int numVertices)
{
    g->numVertices = numVertices;

    for (int i = 0; i < g->numVertices; i++)
    {
        for (int j = 0; j < g->numVertices; j++)
        {
            g->adjMatrix[i][j] = 0;
        }
    }
}

void addEdge(Graph *g, int src, int dest)
{
    g->adjMatrix[src][dest] = 1;
}

void DFS(Graph *g, int startVertex, int visited[])
{
    visited[startVertex] = 1;
    printf("%d ", startVertex);

    for (int i = 0; i < g->numVertices; i++)
    {
        if (g->adjMatrix[startVertex][i] && !visited[i])
        {
            DFS(g, i, visited);
        }
    }
}

void BFS(Graph *g, int startVertex, int visited[])
{
    Queue q;
    initializeQueue(&q);
    visited[startVertex] = 1;
    printf("%d ", startVertex);
    enqueue(&q, startVertex);

    while (!isQueueEmpty(&q))
    {
        int vertex = dequeue(&q);

        for (int i = 0; i < g->numVertices; i++)
        {
            if (g->adjMatrix[vertex][i] && !visited[i])
            {
                visited[i] = 1;
                printf("%d ", i);
                enqueue(&q, i);
            }
        }
    }
}

int main()
{
    Graph g;
    initializeGraph(&g, 6);
    addEdge(&g, 0, 1);
    addEdge(&g, 0, 2);
    addEdge(&g, 1, 2);
    addEdge(&g, 1, 4);
    addEdge(&g, 2, 3);
    addEdge(&g, 3, 4);
    addEdge(&g, 3, 5);

    int visited[MAX_VERTICES] = {0};
    printf("DFS traversal: ");
    DFS(&g, 0, visited);
    printf("\n");

    int visited2[MAX_VERTICES] = {0};
    printf("BFS traversal: ");
    BFS(&g, 0, visited2);
    printf("\n");

    return 0;
}