a = importdata('g3.txt');
m=size(a,1);
for i=1:1:m
        plot(a(i,1),a(i,2),'k*');   
    hold on;
end
grid on;
